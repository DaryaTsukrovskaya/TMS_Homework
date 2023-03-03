package by.teachmeskills.homework.hw_03032023.part4;

public class DebitCardValidator {
    public void validateDebitCard(String num, String type, String name, String date, String cvv) {
        class DebitCard {
            private String cardNumber;
            private String cardType;
            private String customerName;
            private String validity;
            private String cvvCode;

            public DebitCard(String cardNumber, String cardType, String customerName, String validity, String cvvCode) {
                this.cardNumber = cardNumber;
                this.cardType = cardType;
                this.customerName = customerName;
                this.validity = validity;
                this.cvvCode = cvvCode;
            }

            private void validator() {
                if (cardNumber.length() == 16) {
                    if (cardType.equals("Debit")) {
                        if (!(customerName.isBlank())) {
                            char[] validMass = validity.toCharArray();
                            if (validMass[3] == '2' && validMass[4] >= '3') {
                                if (cvv.length() == 3) {
                                    System.out.println("The card is valid.");
                                }

                            }
                        }
                    }
                } else {
                    System.out.println("The card is invalid.");
                }

            }


        }
        DebitCard dCard = new DebitCard(num, type, name, date, cvv);
        dCard.validator();
    }
}
