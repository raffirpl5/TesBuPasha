public class playinstrument {

    public static void main(String[] args) {

        Instrument a = new Instrument();
        Instrument b = new Instrument ("Piano", 200.0);
        Instrument c = new Instrument ("Violin", 250.9);
        
        //Gunakan if-else untuk menentukan Instrument yg paling mahal dan paling murah

        a.setType("Guitar");
        a.setPrice(101.5);

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Guitar adalah harga alat musik yang paling mahal");
        }else if(b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()){
            System.out.println("Piano adalah harga alat musik yang mahal");
        }else{
            System.out.println("Violin adalah harga alat musik yang paling mahal");
        }if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Guitar adalah harga alat musik yang paling murah");
        }else if(b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()){
            System.out.println("Piano adalah harga alat musik yang murah");
        }else{
            System.out.println("Violin adalah harga alat musik yang paling murah");
        }
        

        // a.print();
        // b.print();
        // c.print();
    }
}
