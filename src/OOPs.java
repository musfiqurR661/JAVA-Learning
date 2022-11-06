class watch {
    String color;
    String type;
//single function
   /* public void write() {
        System.out.println("Write Something");
    }
    public void printColor()
    {
        System.out.println(this.color);
    }
     */
   //multiple function
    public void wInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
   /*// non paramitarize constractor
    watch(){
        System.out.println("Constractor Called");
    }

    */
   /* //parametterize /*


    watch(String color, String type)
    {
this.color=color;
this.type=type;
    }
  */
    //copy constractor

watch(watch watch2)
{
   this.color=watch2.color;
   this.type=watch2.type;
}
watch(){

}
}


public class OOPs {
    public static void main(String[] args) {
        //watch watch1 = new watch("Silver", "Still");
        watch watch1 = new watch();
       watch1.color = "Silver";
        watch1.type = "Stil";

        /*watch1.write();
        watch1.printColor();
         */
        watch watch2=new watch(watch1);
        watch1.wInfo();

    }

}
