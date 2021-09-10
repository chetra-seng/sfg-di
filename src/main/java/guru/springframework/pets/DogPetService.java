package guru.springframework.pets;

public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
