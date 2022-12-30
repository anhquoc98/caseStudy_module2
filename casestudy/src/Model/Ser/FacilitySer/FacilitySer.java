package Model.Ser.FacilitySer;

import Model.Repo.FacitilyRepo.RoomRepo;
import Model.model.Facility.Facility;

public class FacilitySer implements IFacilitySer {
    RoomRepo roomRepo = new RoomRepo();

    @Override
    public void list() {
        roomRepo.list();
    }

    @Override
    public void add(Object object) {
        roomRepo.add(object);
    }

    @Override
    public void display() {
        roomRepo.display();
    }
}
