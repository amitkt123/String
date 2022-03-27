public class strng {
    public static void main(String[] args) {
        String s = "Amit";
        System.out.println(s.concat("Tiwari"));//doing this wouldn't change the original
        //string but would only print amit tiwari
        System.out.println(s);//the orignal object remains unchanged
        s = s.concat(" Tiwari");//This operation will create new object which will store Amit Tiwari by
        //concatenating the s with tiwari
        //find all the occurences of the word good
        System.out.println(s);
        String am = "This is amit kumar tiwari. amit is a good boy and also a good progammer";

    }
}
