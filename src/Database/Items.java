package Database;


public class Items {

    /*

        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.

     */

    public static double ItemName(String itemName) {
        double itemprice;
       /* if (itemName.equalsIgnoreCase("Rose teddy bear")) {
            itemprice = 30;
        }
        else if (itemName.equalsIgnoreCase("Iphone max")) {
            itemprice = 850.23;
        }
        else if (itemName.equalsIgnoreCase("laptop mouse")) {
            itemprice = 23.50;
        }
        else  if (itemName.equalsIgnoreCase("Monitor")) {
            itemprice = 90.23;
        }
        else    if (itemName.equalsIgnoreCase("charger")) {
            itemprice = 43.20;
        }
        else  if (itemName.equalsIgnoreCase("hdmi cable")) {
            itemprice = 5.90;
        }
        else  if (itemName.equalsIgnoreCase("mug")) {
            itemprice = 30;
        } else {
            itemprice = 904654;
        }
        return itemprice;*/
        switch (itemName) {
            case "Rose teddy bear":
                itemprice = 30.0;
                break;
            case "Iphone max":
                itemprice = 850.23;
                break;
            case "laptop mouse":
                itemprice = 23.50;
                break;
            case "Monitor":
                itemprice = 90.23;
                break;
            case "charger":
                itemprice = 43.20;
                break;
            case "hdmi cable":
                itemprice = 5.90;
                break;
            case "mug":
                itemprice = 30.0;
                break;
            default:itemprice =0;
        }
    return itemprice;
    }

    /*

        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı

        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli

     */
    public static double colorPrice(String color) {
        double colorprice;
        switch (color) {
            case "Red":
                colorprice = 10;
                break;
            case "Blue":
                colorprice = 6;
                break;

            case "Black":
                colorprice = 4;
                break;
            case "White":
                colorprice = 2;
                break;
            default:
                colorprice = 0;
        }
        return colorprice;
    }
      /*

        Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı

        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli

     */


    /*

        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı

        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */
    public static double customText(String text) {
        double sayilar = 0;
        if (text.length() > 10) {
            sayilar += 5;
        } else {
            sayilar += 3;
        }
        return sayilar;
    }


}



