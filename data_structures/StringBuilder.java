public class StringBuilder {
    private String[] stringArray;
    private int index = 0;
    private int size = 0;
    public static final int DEFAULT_SIZE = 128; 

    StringBuilder() {
        this.stringArray = new String[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
    }

    StringBuilder(int initSize) {
        this.stringArray = new String[initSize];
        this.size = initSize;
    }

    public String toString() {
        String out = "";
        int i = 0;
        while (stringArray[i] != null) {
            out += stringArray[i];
            i++;
        }
        return out;
    }

    public void append(String str) {
        stringArray[index] = str;
        index++;
        if (index >= size) {
            String[] newString = new String[2 * size];
            for (int i = 0; i < size; i++) {
                newString[i] = this.stringArray[i];
            }
            this.stringArray = newString;
            this.size = 2 * size;
        }
    }

    public int size() {
        return index;
    }

    public static void main(String[] args) {
        StringBuilder test = new StringBuilder();
        test.append("aaa");
        test.append("bbb");
        System.out.println(test.toString());
        System.out.println(test.size());
        test.append("ccc");
        test.append("ddd");
        System.out.println(test.toString());
        System.out.println(test.size);
    }
}