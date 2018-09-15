package Model;

import java.util.Date;

public class Card
{
   // the owner of the card can differ from the owner of the bank account
   // as many users cand acces the same account through many cards owned by
   // family
   // members for eg
  // private Customer owner;
   private int cardNo;
   private String type;
   private String name;
   private Date validFrom;
   private Date validTo;

   // probably random generated. not sure about setters and getters
   // and where to be initialized
   private int pinNo;

   public Card(int cardNo, String type, String name, Date validFrom,
         Date validTo, Customer cus)
   {
      this.cardNo = cardNo;
      this.type = type;
      this.name = name;
      this.validFrom = validFrom;
      this.validTo = validTo;
     // this.owner = cus;
   }

   public synchronized int getCardNo()
   {
      return cardNo;
   }

   public synchronized void setCardNo(int cardNo)
   {
      this.cardNo = cardNo;
   }

   public synchronized String getType()
   {
      return type;
   }

   public synchronized void setType(String type)
   {
      this.type = type;
   }

   public synchronized String getName()
   {
      return name;
   }

   public synchronized void setName(String name)
   {
      this.name = name;
   }

   public synchronized Date getValidFrom()
   {
      return validFrom;
   }

   public synchronized void setValidFrom(Date validFrom)
   {
      this.validFrom = validFrom;
   }

   public synchronized Date getValidTo()
   {
      return validTo;
   }

   public synchronized void setValidTo(Date validTo)
   {
      this.validTo = validTo;
   }

   public synchronized String toString()
   {
      return "Card number : " + cardNo + "\nCard type : " + type
            + "\nCard name : " + name + "\nValid from : " + validFrom
            + "\nValid to : " + validTo; 
//            + "\nOwner : "
//            + owner.getCustomerInfo().getFistName() + " "
//            + owner.getCustomerInfo().getLastName();
   }

}
