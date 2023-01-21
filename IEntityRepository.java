package org.example.Generics.t.repositorydesignpattern;

public interface IEntityRepository<T extends IEntity>{
    void add(T param);
    void delete(T param);
    void update(T param);
}
