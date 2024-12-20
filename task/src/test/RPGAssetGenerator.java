package test;

//import java.awt.Color;
//import java.awt.image.BufferedImage;
//import java.util.Scanner;
//
//public class RPGAssetGenerator {
//
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    // Get user input for tile size
//    System.out.print("Enter desired tile size (pixels): ");
//    int size = scanner.nextInt();
//
//    // Create a new image
//    BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
//
//    // Generate a checkerboard pattern (replace with your desired pattern)
//    for (int y = 0; y < size; y++) {
//      for (int x = 0; x < size; x++) {
//        if ((x + y) % 2 == 0) {
//          image.setRGB(x, y, Color.WHITE.getRGB());
//        } else {
//          image.setRGB(x, y, Color.GRAY.getRGB());
//        }
//      }
//    }
//
//    // Save the image (replace "tileset.png" with your desired filename)
//    try {
//      javax.imageio.ImageIO.write(image, "png", new java.io.File("tileset.png"));
//      System.out.println("Tileset generated successfully!");
//    } catch (Exception e) {
//      System.out.println("Error saving image: " + e.getMessage());
//    }
//
//    scanner.close();
//  }
//}
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class RPGAssetGenerator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Character design (replace with your desired design)
    Color[][] head = {
      {Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK},
      {Color.BLACK, Color.WHITE, Color.WHITE, Color.WHITE, Color.BLACK},
      {Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, Color.BLACK},
      {Color.BLACK, Color.WHITE, Color.WHITE, Color.WHITE, Color.BLACK},
      {Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK},
    };

    Color[][] torso = {
      {Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK},
      {Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK},
      {Color.BLACK, Color.BLACK, Color.WHITE, Color.BLACK, Color.BLACK},
      {Color.BLACK, Color.BLACK, Color.WHITE, Color.BLACK, Color.BLACK},
      {Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK},
    };

    // Get user input for character customization
    System.out.println("Character Customization:");
    System.out.print("Enter desired tile size (pixels): ");
    int size = scanner.nextInt();

    // Allow customization options (add more as needed)
    System.out.print("Enter hair color (e.g., BLACK, YELLOW): ");
    String hairColor = scanner.next().toUpperCase();

    // Modify head color based on user input
    if (hairColor.equals("YELLOW")) {
      for (int y = 0; y < head.length; y++) {
        head[y][1] = Color.YELLOW;
        head[y][3] = Color.YELLOW;
      }
    }

    // Create a new image
    BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);

    // Draw the character on the image
    int headX = 0;
    int headY = 0;
    int torsoX = 0;
    int torsoY = head.length; // Place torso below the head

    drawCharacterPart(image, head, headX, headY);
    drawCharacterPart(image, torso, torsoX, torsoY);

    // Save the image (replace "character.png" with your desired filename)
    try {
      javax.imageio.ImageIO.write(image, "png", new java.io.File("character.png"));
      System.out.println("Character generated successfully!");
    } catch (Exception e) {
      System.out.println("Error saving image: " + e.getMessage());
    }

    scanner.close();
  }

  // Method to draw a character body part on the image
  private static void drawCharacterPart(BufferedImage image, Color[][] part, int x, int y) {
    for (int i = 0; i < part.length; i++) {
      for (int j = 0; j < part[0].length; j++) {
        image.setRGB(x + j, y + i, part[i][j].getRGB());
      }
    }
  }
}


