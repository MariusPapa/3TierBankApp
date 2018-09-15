package Model;

import java.util.ArrayList;
import java.util.Date;

public class Account
{
   // the owner that has full power over the account
   // private Customer owner;

   private ArrayList<Card> cards;
   private int regNo;
   private int accountNo;
   private double balance;
   private String currency;
   private Date validFrom;
   private boolean activ;

   public Account(ArrayList<Card> cards, int regNo, int accNo, double balance,
         String currency, Date validFrom, boolean active)
   {
      // this.owner = owner;
      this.cards = cards;
      this.regNo = regNo;
      this.accountNo = accNo;
      this.balance = balance;
      this.validFrom = validFrom;
      this.activ = active;

   }

   public Account(int regNo, int accNo, String currency, Date validFrom,
         boolean active)
   {
      this.cards = null;
      this.regNo = regNo;
      this.accountNo = accNo;
      this.balance = 0;
      this.validFrom = validFrom;
      this.activ = active;

   }

   public synchronized ArrayList<Card> getCards()
   {
      return cards;
   }

   public synchronized void setCards(ArrayList<Card> cards)
   {
      this.cards = cards;
   }

   public synchronized int getRegNo()
   {
      return regNo;
   }

   public synchronized void setRegNo(int regNo)
   {
      this.regNo = regNo;
   }

   public synchronized int getAccountNo()
   {
      return accountNo;
   }

   public synchronized void setAccountNo(int accountNo)
   {
      this.accountNo = accountNo;
   }

   public synchronized double getBalance()
   {
      return balance;
   }

   public synchronized void setBalance(double balance)
   {
      this.balance = balance;
   }

   public synchronized String getCurrency()
   {
      return currency;
   }

   public synchronized void setCurrency(String currency)
   {
      this.currency = currency;
   }

   public synchronized Date getValidFrom()
   {
      return validFrom;
   }

   public synchronized void setValidFrom(Date validFrom)
   {
      this.validFrom = validFrom;
   }

   public synchronized boolean isActiv()
   {
      return activ;
   }

   public synchronized void setActiv(boolean activ)
   {
      this.activ = activ;
   }

   // not sure if it has to be here
   /**
    * Add a new card associated with this account
    * 
    * @param card
    */

   public synchronized void addCard(Card card)
   {
      if (!cards.contains(card))
         cards.add(card);
   }

   /**
    * Delete a card from the card list associated with this account
    * 
    * @return
    */

   public synchronized Card deleteCard(int cardNo)
   {
      Card card;
      for (int i = 0; i < cards.size(); i++)
      {
         if (this.cards.get(i).getCardNo() == cardNo)
         {
            card = this.cards.get(i);
            this.cards.remove(i);
            return card;
         }

      }
      return null;
   }

   public synchronized String toString()
   {
      return "Registration number : " + regNo + "\nAccount number : "
            + accountNo + "\nValid from : " + validFrom + "\nActiv : " + activ;
   }

}
