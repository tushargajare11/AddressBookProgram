
public class EditContact {
    ContactRepo contactRepo = ContactRepo.getInstance();
    DeleteContact deleteContact = new DeleteContact();
    Application application = new Application();
    public void EditContact(String editName){
        NewContact deleteCopy = contactRepo.getContact(editName);
        if(contactRepo.checkContact(editName)){
            deleteContact.removeContact(deleteCopy);
            application.newContact();
        }
        else {
            System.out.println("Do not match");
        }
    }
}
