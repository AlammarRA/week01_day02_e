package e3;

import java.net.SocketTimeoutException;

public class role {
    public static void main(String[] args) {

        String  role1 = "Admin" ,
                role2 = "Superuser" ,
                role3 = "User",
                NameOfUser1 = "Rahaf Alammar",
                NameOfUser2 = "Sarah Alkhalifah",
                NameOfUser3 = "Saleh Alibrahim",
                roleOfUser1 = "User",
                roleOfUser2 = "Superuser",
                roleOfUser3 = "Admin"     ;

        //User1
        if(roleOfUser1 == role1){
            System.out.println("Welcome "+NameOfUser1+" Your role is = "+role1);
        }else
        {
            if(roleOfUser1 == role2){
                System.out.println("Welcome "+NameOfUser1+" Your role is = "+role2);
            }else{
                System.out.println("Welcome "+NameOfUser1+" Your role is = "+role3);
            }
        }


        //User2
        if(roleOfUser2 == role1){
            System.out.println("Welcome "+NameOfUser2+" Your role is = "+role1);
        }else
        {
            if(roleOfUser2 == role2){
                System.out.println("Welcome "+NameOfUser2+" Your role is = "+role2);
            }else{
                System.out.println("Welcome "+NameOfUser2+" Your role is = "+role3);
            }
        }


        //User3
        if(roleOfUser3 == role1){
            System.out.println("Welcome "+NameOfUser3+" Your role is = "+role1);
        }else
        {
            if(roleOfUser3 == role2){
                System.out.println("Welcome "+NameOfUser3+" Your role is = "+role2);
            }else{
                System.out.println("Welcome "+NameOfUser3+" Your role is = "+role3);
            }
        }


    }
}
