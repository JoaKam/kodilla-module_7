import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum newForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfBooks = newForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().getYear() <= 1997)
                .filter(user -> user.getPostsNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        //PoemBeautifier newPoem = new PoemBeautifier();

        //String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.";

        //System.out.println(newPoem.beautify(text, (s) -> s.toUpperCase()));
        //System.out.println(newPoem.beautify(text, PoemDecorStars::decoratePoem));
        //System.out.println(newPoem.beautify(text, PoemDecorPokemon::decoratePoem));

    }
}
