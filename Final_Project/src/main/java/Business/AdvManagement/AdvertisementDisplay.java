/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdvManagement;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class AdvertisementDisplay {
    private AdvertisementCatalog custAdvList;
    private JLabel imageAdvertisement; // JLabel for displaying advertisements
    private String username; // String for username
    private int currentAdvIndex = 0; // To track the current advertisement
    private Timer advTimer; // Swing Timer

    /**
     * Constructor to initialize the advertisement display.
     *
     * @param catalog The advertisement catalog.
     * @param adLabel The JLabel to display advertisements.
     */
    public AdvertisementDisplay(AdvertisementCatalog catalog, JLabel adLabel, String username) {
        this.custAdvList = catalog;
        this.imageAdvertisement = adLabel;
        this.username = username;
        setupAdvertisementDisplay();
    }

    /**
     * Sets up the advertisement display with a timer.
     */
    private void setupAdvertisementDisplay() {
    ArrayList<Advertisement> advList = custAdvList.getAdvertisementList();

    // Validate the advertisement list
    if (advList == null || advList.isEmpty()) {
        imageAdvertisement.setText("No advertisements available");
        return;
    }

    // Display the first advertisement immediately
    Advertisement firstAdv = advList.get(currentAdvIndex);
    if (firstAdv.getAdvImage() != null) {
        imageAdvertisement.setIcon(firstAdv.getAdvImage());
        imageAdvertisement.setText(""); // Clear any placeholder text
    } else {
        imageAdvertisement.setText(firstAdv.getAdvName()); // Fallback to text if no image
    }

    // Increment the index for the next advertisement
    currentAdvIndex = (currentAdvIndex + 1) % advList.size();

    // Initialize the timer to update advertisements every 3 seconds
    advTimer = new Timer(3000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!advList.isEmpty()) {
                // Get the current advertisement
                Advertisement currentAdv = advList.get(currentAdvIndex);

                // Update the JLabel with the advertisement image
                if (currentAdv.getAdvImage() != null) {
                    imageAdvertisement.setIcon(currentAdv.getAdvImage());
                    imageAdvertisement.setText(""); // Clear any placeholder text
                } else {
                    imageAdvertisement.setText(currentAdv.getAdvName()); // Fallback to text if no image
                }

                // Increment to the next advertisement
                currentAdvIndex = (currentAdvIndex + 1) % advList.size(); // Loop back to the start
            }
        }
    });

    advTimer.start(); // Start the timer

    // Add a MouseListener to detect clicks on the advertisement
    imageAdvertisement.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (!advList.isEmpty()) {
                // Determine the last displayed advertisement
                Advertisement clickedAdv = advList.get((currentAdvIndex - 1 + advList.size()) % advList.size());
                clickedAdv.addClickCount();
                clickedAdv.addClickStream(username);
                //System.out.println("Click count for " + clickedAdv.getAdvName() + ": " + clickedAdv.getAdvClickCount());
            }
        }
    });
}

    /**
     * Stops the advertisement rotation.
     */
    public void stopAdvertisementDisplay() {
        if (advTimer != null) {
            advTimer.stop();
        }
    }
}
