import java.util.Map;
import java.util.HashMap;;
class CountAndSay{

    public static void main(String[] args) {
        String str = "3332155";
        System.out.println(str.substring(0, str.length()));
    }
    // public String countAndSay(int n) {
        
    // }
    
    public static String convert(String str){
        Map<Character, Integer> map = new HashMap<>();
        map.put(str.charAt(0), 1);
        String res = "";
        int i;
        for(i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else{
                res = res.concat(Integer.toString(map.get(str.charAt(i-1)))).concat(String.valueOf(str.charAt(i-1)));
                map.put(str.charAt(i), 1);
            }
        }
        res = res.concat(Integer.toString(map.get(str.charAt(i-1)))).concat(String.valueOf(str.charAt(i-1)));
        return res;

    }
}