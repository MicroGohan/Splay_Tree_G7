package com.mycompany.main;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
        /** Creating object of SplayTree **/
        SplayTree spt = new SplayTree(); 
        System.out.println("Splay Tree Test\n");          
        char ch;
        /**  Perform tree operations  **/
        do    
        {
            System.out.println("\nSplay Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. remove ");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty");
            System.out.println("6. clear tree");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                spt.insert( scan.nextInt() );                     
                break;
            case 2 : 
                System.out.println("Enter integer element to remove");
                spt.remove( scan.nextInt() );                     
                break;                          
            case 3 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ spt.search( scan.nextInt() ));
                break;                                          
            case 4 : 
                System.out.println("Nodes = "+ spt.countNodes());
                break;     
            case 5 : 
                System.out.println("Empty status = "+ spt.isEmpty());
                break;     
            case 6 : 
                System.out.println("\nTree Cleared");
                spt.clear();
                break;        
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /**  Display tree  **/
            System.out.print("\nPost order : ");
            spt.postorder();
            System.out.print("\nPre order : ");
            spt.preorder();
            System.out.print("\nIn order : ");
            spt.inorder(); 
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');     
    }
    
}
