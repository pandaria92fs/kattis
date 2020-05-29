import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class what {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> getInput = new ArrayList<>();
         File f = new File("b-sample.in");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()) {
            getInput.add(scanner.nextLine());
        }
        List <String> fox = cal(getInput);
        String last = fox.get(fox.size()-1);
        fox.remove(fox.size()-1);
        for (String foxs : fox) {
            System.out.print(foxs+" ");
        }
        System.out.print(last);

    }

    private static List<String> cal(List<String> getInput) {
        String realSound = getInput.get(1);
        getInput.remove(0);
        getInput.remove(0);
//        System.out.println(getInput.get(1));
        getInput.remove(getInput.size()-1);
        Map<String, String> animalSound = new HashMap<>(getInput.size());
//        System.out.println(getInput.get(1));
        List<String> fox = new ArrayList<>();
        for (String sound : getInput) {
            String[] storage = sound.split(" ");
            animalSound.put(storage[0], storage[2].toLowerCase());
//            System.out.println(sound);
        }
        String[] soundArray = realSound.split(" ");

        List<String> soundList = Arrays.asList(soundArray);
        for (String sound : soundList) {
//            System.out.println(sound);
            if (!animalSound.containsValue(sound)) {
                fox.add(sound);
            }
        }
        return fox;
    }
}
