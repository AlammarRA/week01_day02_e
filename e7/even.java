package e7;

public class even {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 25 ; i++){
            if(i%2==0){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
}
