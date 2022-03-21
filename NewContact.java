
public class NewContact {
        String name;
        String lastName;
        String city;
        String state;
        int  zipCode;
        long phoneNumber;
        String emailID;

        @Override
        public String toString() {
                return "NewContact{" +
                        "name='" + name + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", city='" + city + '\'' +
                        ", state='" + state + '\'' +
                        ", zipCode=" + zipCode +
                        ", phoneNumber=" + phoneNumber +
                        ", emailID='" + emailID + '\'' +
                        '}';
        }
}
