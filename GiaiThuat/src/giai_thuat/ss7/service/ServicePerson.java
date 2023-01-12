package giai_thuat.ss7.service;

import giai_thuat.ss7.repository.RepoPerson;

public class ServicePerson implements IServicePerson {
    RepoPerson repoPerson = new RepoPerson();

    @Override
    public void list() {
        repoPerson.list();
    }
}
