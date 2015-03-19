package statustwitter;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase para recobrar los twitts del morrazo
 * @author damian
 */
public class StatusTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {
     
        Twitter mitwitter = new TwitterFactory().getInstance();
 ConfigurationBuilder cb = new ConfigurationBuilder();
cb.setDebugEnabled(true)
  .setOAuthConsumerKey("VoSmbUz4KtX6LWMADG2wjcai4")
                .setOAuthConsumerSecret("l6UmkUXGVp7kARYmNGB0of5PsVuelFaokEm9rI4v5Fsjb9KZ7U")
                .setOAuthAccessToken("3055290010-QWLhHK12ERY0t18MVAXQk4EfINP44CO9LtFP2Xq")
                .setOAuthAccessTokenSecret("JsDAHOzJOk0YPlXQn56WOM6zpzei2nKvd4m1VerbVT2Gf");
TwitterFactory tf = new TwitterFactory(cb.build());
Twitter twitter = tf.getInstance();
        
        Query query = new Query("#Cangas");
        QueryResult result = mitwitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }
}
