package be.wkam.immocam.services;

import be.wkam.immocam.entities.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@Primary
public interface IGenericService<T,U> {
    public T save(T t); //C
    public List<T> list();     //R all
    public T get(U id); // R  single
    public T update(T t, U id ); // U update
    public void delete(U id  ); // D delete

}
