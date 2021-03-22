package tech.itpark.proggerhub;

import tech.itpark.di.Container;
import tech.itpark.proggerhub.repository.UserRepository;
import tech.itpark.proggerhub.service.UserService;

import java.lang.reflect.InvocationTargetException;

public class Main {
    // psvm + Tab -> main
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        // TODO: MVP -> Minimal Valuable Product
        // videos
        // users/owners <-> consumers
        // Domain Model -> предметная область

        Container container = new Container();
        container.register(UserRepository.class, UserService.class);
        container.wire();
        System.out.println("finish");
    }
}
