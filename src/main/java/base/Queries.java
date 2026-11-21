package base;

import lombok.NonNull;

import java.util.List;
import java.util.Map;

/**
 * Defines queries for your {@link Repository} implementation.
 *
 * @param <T> the type of your top-level class
 * @param <U> the type of your static nested class
 * @param <V> the type of your enumerated class
 */
public interface Queries<T, U, V extends Enum<V>> {

    /**
     * Returns the sum of the age of the actors (counting each occurrence) that have the given nationality.
     *
     * @param nationality the nationality of the actor
     * @return the result
     */
    int query1(
            @NonNull String nationality);

    /**
     * Returns the sorted copy of the movies using the {@link Comparable} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the genre of the <i>movie</i> (descending)
     *     <li> the title of the <i>movie</i> (ascending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>This task includes the implementation of the {@link Comparable} interface in your model class due to its nature.
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query2();

    /**
     * Returns the sorted copy of the movies using the {@link java.util.Comparator} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the genre of the <i>movie</i> (descending)
     *     <li> the release year of the <i>movie</i> (descending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>The {@link java.util.Comparator} interface must be implemented as a static nested class of the class representing the <i>movie</i>.
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query3();

    /**
     * Returns the first movie that has the given genre.
     * Returns <code>null</code> if no <i>movie</i> matches the condition.
     *
     * @param genre the genre of the movie
     * @return the result
     */
    T query4(
            @NonNull String genre);

    /**
     * Returns all the movies whose release year is greater than the given value.
     *
     * @param year the release year of the movie
     * @return the result
     */
    List<T> query5(
            int year);

    /**
     * Returns a dictionary that maps each genre to the first movie having that genre.
     *
     * @return the result
     */
    Map<String, T> query6();
}
