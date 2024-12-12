/*

public class Ex0_OOPHelpCode{




//- - - - example getter methods - - - - - - - - - - - - 
    public String getName(){
        return name;
    }//getName
    public int getAge(){
        return age;
    }//getAge

//- - - - example setter methods - - - - - - - - - - - -
    public void setName(String n){
        name = n;
    }//setName
    public void setAge(int a){
        age = a;
    }//setAge



//- - - - example ArrayList methods (linear search) - - - - - - - -


    public static int searchByName(  ArrayList<Student> arr, String searchTerm     ){
        //notice that the above ArrayList type must be customized
        for(int i=0; i<arr.size(); i++){
            if(searchTerm.equalsIgnoreCase( arr.get(i).getName()  )  ){
                //notice that you must add the correct getter method above
                return i;
            }        
        }
        return -1;       
    }//search

    public static void printAll(  ArrayList<Student> arr   ){
        //notice that the above ArrayList type must be customized
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i).toString() ) ;
            //the above line assumes a toString method has been created
        }

    }//printAll




}

*/