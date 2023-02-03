package Models;

import HelperFunctions.HelperFunctions;

public class User {

    /*

        User içerisinde attribute larin hepsi private tanımlanmalı.

            String fullName;
            String city;
            String address;
            String zipCode;
            double myPrice
            String shippingTrackingNumber

        Attribute lar burada tanımlanıcak -->

     */
    private String fullName;
    private String city;
    private String address;
    private String zipCode;
    private  double myPrice;
    private String shippingTrackingNumber;

            /*Bu class bir constructor içermeli ve gelen
            ** fullname, address, city, zipcode değerlerini parametre olarak almalı.**
            1- parametre ile gelen fullname ve address değerleri classtaki attribute lara eşitlenmeli
            2- city methodu eşitlenmeden once helper functions icerisindeki ilgili method ile doğrulanmalı
            3- zipcode tanımlanmadan önce helper functions içerisindeki ilgili method ile doğrulanmalı
            4- shippingTrackingNumber helper functions tarafından oluşturulmalı ve eşitlenmeli
       */

    public User(String fullName, String city, String address, String zipCode) {
        this.fullName = fullName;
        this.address = address;
        this.city=city;
        this.zipCode=zipCode;
//        city = HelperFunctions.checkhCity(city);
//        zipCode = HelperFunctions.checkZipCode(zipCode);
        shippingTrackingNumber = HelperFunctions.generateShippingTrackingNumber(fullName, city, zipCode);

    }
       /*

        myPrice için bir getter bir de setter method oluşmalı
        getter method basic olabilir.
        setter method parametre olarak bir price almalı ve parametre ile gelen değeri myPrice a eklemeli
        // Methodlar burada tanımlanacak

     */

    public double getMyPrice() {
        return this.myPrice;
    }

    public void setMyPrice(double Price) {
      myPrice +=Price;
    }


    @Override
    public String toString() {
        return "----------------\n" +
                "Full Name : " + this.fullName + '\n' +
                "City : " + this.city + '\n' +
                "Adress : " + this.address + '\n' +
                "Zip Code : " + this.zipCode + '\n' +
                "Your Shipping Tracking Number : " + this.shippingTrackingNumber + '\n' +
                "Total User Price : " + this.myPrice + '\n' +
                "----------------";
    }
}
