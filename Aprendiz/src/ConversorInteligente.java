import java.io.IOException;
import java.nio.file.*;
import java.util.regex.*;


/**
 * Exercício ? - Nível ?
 * Objetivo: Conversão inteligente finalizada!
 */
public class ConversorInteligente {

    public static void main(String[] args) throws IOException {

        String caminhoProjeto = "/home/susyaniv/IdeaProjects/java-matriz-exercicios/Intermediario/src";

        Files.walk(Paths.get(caminhoProjeto))
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(ConversorInteligente::processarArquivo);

        
    }

    private static void processarArquivo(Path path) {

        try {
            String conteudo = Files.readString(path);

            // Captura texto do print
            Pattern printPattern = Pattern.compile("System\\.out\\.println\\(\"([^\"]+)\"\\);");
            Matcher printMatcher = printPattern.matcher(conteudo);

            if (!printMatcher.find()) return;

            String objetivo = printMatcher.group(1);

            // Remove o print
            conteudo = printMatcher.replaceAll("");

            // Captura o nível pelo package
            Pattern packagePattern = Pattern.compile("package\\s+Nivel_(\\d+);");
            Matcher packageMatcher = packagePattern.matcher(conteudo);

            String nivel = packageMatcher.find() ? packageMatcher.group(1) : "?";

            // Captura número do exercício pelo nome da classe
            Pattern classPattern = Pattern.compile("public\\s+class\\s+Exercicio(\\d+)");
            Matcher classMatcher = classPattern.matcher(conteudo);

            String numero = classMatcher.find() ? classMatcher.group(1) : "?";

            // Monta comentário inteligente
            String comentario = "\n/**\n" +
                    " * Exercício " + numero + " - Nível " + nivel + "\n" +
                    " * Objetivo: " + objetivo + "\n" +
                    " */\n";

            // Insere antes da classe
            conteudo = conteudo.replaceFirst("public\\s+class", comentario + "public class");

            Files.writeString(path, conteudo);

            System.out.println("Atualizado: " + path);

        } catch (IOException e) {
            System.out.println("Erro: " + path);
        }
    }
}
