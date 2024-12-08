/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdvManagement;

import java.awt.Color;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author aakashbelide
 */
public class AdvertisementVisualizations {
    
    public static void showBarChart(List<Map.Entry<String, Integer>> topCustomers) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int numCust = 0;

        for (Map.Entry<String, Integer> entry : topCustomers) {
            dataset.addValue(entry.getValue(), "Clicks", entry.getKey());
            numCust += 1;
        }

        // Create the bar chart with a blue color for bars
        JFreeChart barChart = ChartFactory.createBarChart(
            "Top " + numCust + " Customers by Clicks",
            "Customers",
            "Click Count",
            dataset
        );

        // Set the color of the bars to blue (RGB: 0, 153, 255)
        barChart.getCategoryPlot().getRenderer().setSeriesPaint(0, new Color(0, 153, 255));

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        JFrame frame = new JFrame();
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void showClickTable(Map<String, Integer> timeFrameData) {
        String[] columnNames = { "Time Frame", "Click Count" };
        Object[][] data = {
            { "Last 1 Minute", timeFrameData.get("1 Minute") },
            { "Last 5 Minutes", timeFrameData.get("5 Minutes") },
            { "Last 10 Minutes", timeFrameData.get("10 Minutes") }
        };

        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Ensure that the table fills the viewport height properly without extra space
        table.setFillsViewportHeight(true);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());

        // Create a JFrame to display the table
        JFrame frame = new JFrame("Click Counts in Time Frames");
        frame.add(scrollPane);
        frame.setSize(400, 200); // Set the window size to fit the table
        frame.setVisible(true);
    }
}
