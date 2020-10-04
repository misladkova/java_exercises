import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeRun {

    public ArrayList<String> readFile(String fileName) {
        ArrayList<String> recipes = new ArrayList<>();
        try (Scanner read = new Scanner(Paths.get(fileName))) {
            while (read.hasNextLine()) {
                String line = read.nextLine();
                recipes.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }

    public void runList(String file) {
        System.out.println();
        System.out.println("Recipes:");
        ArrayList<String> text = readFile(file);
        int count = 0;
        for (int i = 0; i < text.size(); i++) {
            String line = text.get(i);
            count++;
            if (line.isEmpty()) {
                count = 0;
                continue;
            }
            if (count == 1) {
                String x = text.get(i + 1);
                i++;
                System.out.print(line + ", cooking time: " + x + "\n");
            }
        }
    }

    public void runFindName(String file, Scanner scanner) {
        System.out.print("Searched word: ");
        String word = scanner.nextLine();
        System.out.println("Recipes:");
        ArrayList<String> recipes = readFile(file);
        int count = 0;
        for (int i = 0; i < recipes.size(); i++) {
            String line = recipes.get(i);
            count++;
            if (line.isEmpty()) {
                count = 0;
                continue;
            }
            if (count == 1 && line.contains(word)) {
                String x = recipes.get(i + 1);
                i++;
                System.out.print(line + ", cooking time: " + x + "\n");
            }
        }
    }

    public ArrayList<String> findCookingTimeLess(int maxCookingTime, String file) {
        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> all = readFile(file);
        int count = 0;
        for (int i = 0; i < all.size(); i++) {
            String line = all.get(i);
            count++;
            if (line.isEmpty()) {
                count = 0;
                continue;
            }
            if (count == 1) {
                String x = all.get(i + 1);
                i++;
                String y = line + ", cooking time: " + x;
                int cookingTime = Integer.valueOf(x);
                if (cookingTime <= maxCookingTime) {
                    output.add(y);
                }
            }
        }
        return output;
    }

    public void runFindCookingTime(String file, Scanner scanner) {
        System.out.print("Max cooking time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        System.out.println("Recipes:");
        ArrayList<String> shortRecipes = findCookingTimeLess(maxTime, file);
        for (String shortRecipe : shortRecipes) {
            System.out.println(shortRecipe);
        }
    }

    public void runFindIngredient(String file1, Scanner scan) {
        System.out.print("Ingredient: ");
        String ingredient = scan.nextLine();
        System.out.println();
        System.out.println("Recipes:");
        ArrayList<String> all = readFile(file1);

        ArrayList<ArrayList<String>> together = new ArrayList<ArrayList<String>>();
        int countRecipe = 0;
        ArrayList<String> list = new ArrayList<>();
        together.add(list);
        for (int j = 0; j < all.size(); j++) {
            String line = all.get(j);
            together.get(countRecipe).add(line);
            if (line.isEmpty()){
                countRecipe++;
                if (j<all.size()-1) {
                    ArrayList<String> list1 = new ArrayList<>();
                    together.add(list1);
                }
            }
        }
        for (int i=0; i<together.size(); i++){
            for (int j = 2; j<together.get(i).size(); j++){
                if (together.get(i).get(j).equals(ingredient)){
                    String recipeName = together.get(i).get(0);
                    String recipeTime = together.get(i).get(1);
                    System.out.print(recipeName + ", cooking time: " + recipeTime + "\n");
                }
            }
        }

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println();
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\n" +
                "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println();
            System.out.print("Enter the command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                runList(file);
            }
            if (command.equals("find name")) {
                runFindName(file, scanner);
            }
            if (command.equals("find cooking time")) {
                runFindCookingTime(file, scanner);
            }
            if (command.equals("find ingredient")) {
                runFindIngredient(file, scanner);
            }
        }
    }
}
