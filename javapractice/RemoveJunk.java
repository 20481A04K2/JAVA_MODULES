import java.util.*;
import static java.lang.System.*;
public class RemoveJunk {
    public static void main(String args[]){
        String a="@@$%^*%%$##* hi madhu babu 02324354643";
        //here replaceAll(regex,replacement),where regex is regular exp and by this we replace 
        //to print unwanted symbols
        a=a.replaceAll("[a-zA-Z0-9]"," ");
        out.println(a);
        //^ this symbol represents the character and to print char,ints
        String b="@@$%^*%%$##* hi madhu babu 02324354643";
        //if we want replace char or integers we must start with '^'.that is char operator
        b=b.replaceAll("[^a-zA-Z0-9]"," ");
        out.println(b);
        String c="hi   madhu   babu     reddy";
        c=c.replaceAll("\\s", "");
        out.println("RemoveWhitespaces:"+ c);

    }
}
