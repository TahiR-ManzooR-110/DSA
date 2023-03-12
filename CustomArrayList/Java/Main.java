public class Main {
    public static void main(String[] args) {
        CustomArrayList carr = new CustomArrayList();
        carr.insert(1);
        carr.insert(2);
        carr.insert(3);
        carr.insert(4);
        carr.insert(5);
        carr.insert(6);
        carr.insert(7);

        for (int i = 0; i < carr.getSize(); i++) {
            System.out.println(carr.get(i));
        }
    }
}