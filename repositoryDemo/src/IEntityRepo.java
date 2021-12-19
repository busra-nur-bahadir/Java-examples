public interface IEntityRepo <T extends IEntity> {
    void add(T item);
    void delete(T item);
    void update(T item);
}
