/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductManagement;

import Business.Enterprise.SuperMarketEnterprise;
import Business.Geolocation.LatLong;
import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * @author aakashbelide
 */
public class BestStoreFinder {
    /**
     * Finds the best stores to fulfill the requested products based on the given factor.
     *
     * @param supermarkets       List of all supermarkets with their catalogs and locations.
     * @param requestedProducts  Map containing product names and their required quantities.
     * @param customerLocation   Customer's location as a LatLong object.
     * @param factor             Factor to determine sorting: "Price" or "Distance".
     * @return A Map containing recommendations and total cost.
     */
    public static Map<String, Object> findBestStores(
            List<SuperMarketEnterprise> supermarkets,
            Map<String, Integer> requestedProducts,
            LatLong customerLocation,
            String factor
    ) {
        Map<String, List<Map<String, Object>>> recommendations = new HashMap<>();
        double totalCost = 0;

        for (Map.Entry<String, Integer> request : requestedProducts.entrySet()) {
            String productName = request.getKey();
            int quantityNeeded = request.getValue();

            List<Map<String, Object>> productRecommendations = new ArrayList<>();
            int quantityFulfilled = 0;

            // Gather all stores that have the product
            List<Map<String, Object>> storesWithProduct = new ArrayList<>();
            for (SuperMarketEnterprise supermarket : supermarkets) {
                ProductCatalog catalog = supermarket.getProductCatalog();
                Product product = catalog.checkProdInList(productName);

                if (product != null && product.getProdQuant() > 0) {
                    double distance = supermarket.getDistance(customerLocation);
                    storesWithProduct.add(Map.of(
                            "store", supermarket,
                            "product", product,
                            "distance", distance
                    ));
                }
            }

            // Sort stores by the given factor
            storesWithProduct.sort((a, b) -> {
                if (factor.equals("Price")) {
                    float priceA = ((Product) a.get("product")).getProdPrice();
                    float priceB = ((Product) b.get("product")).getProdPrice();
                    return Float.compare(priceA, priceB);
                } else { // Default: sort by Distance
                    double distanceA = (double) a.get("distance");
                    double distanceB = (double) b.get("distance");
                    return Double.compare(distanceA, distanceB);
                }
            });

            // Allocate quantities from the sorted stores
            for (Map<String, Object> storeInfo : storesWithProduct) {
                if (quantityFulfilled >= quantityNeeded) break;

                SuperMarketEnterprise store = (SuperMarketEnterprise) storeInfo.get("store");
                Product product = (Product) storeInfo.get("product");
                int stockAvailable = product.getProdQuant();
                float price = product.getProdPrice();
                double distance = (double) storeInfo.get("distance");

                int quantityFromThisStore = Math.min(quantityNeeded - quantityFulfilled, stockAvailable);

                productRecommendations.add(Map.of(
                        "storeName", store.getOrgName(),
                        "productName", productName,
                        "price", price,
                        "quantityAvailable", stockAvailable,
                        "quantityFulfilled", quantityFromThisStore,
                        "distance", distance
                ));

                quantityFulfilled += quantityFromThisStore;
                totalCost += price * quantityFromThisStore;

                // Reduce the stock in the store
                product.decProdQuant(quantityFromThisStore);
            }

            // Handle cases where the product is not fully fulfilled
            if (quantityFulfilled < quantityNeeded) {
                productRecommendations.add(Map.of(
                        "storeName", "Not Found",
                        "productName", productName,
                        "price", "N/A",
                        "quantityAvailable", 0,
                        "quantityFulfilled", quantityNeeded - quantityFulfilled,
                        "distance", "N/A"
                ));
            }

            recommendations.put(productName, productRecommendations);
        }

        // Return the results
        Map<String, Object> result = new HashMap<>();
        result.put("recommendations", recommendations);
        result.put("totalCost", totalCost);
        return result;
    }
}
