using Antlr4.Runtime;


namespace AExclamated
{
    class AExclamated
    {
        public static void Main(string[] Args)
        {
            string FileName = @""; // Will be Args[0]
               
            string Contents = File.ReadAllText(FileName);

            AntlrInputStream Input = new AntlrInputStream(Contents);
            AExclamatedLexer Lexer = new AExclamatedLexer(Input);
            CommonTokenStream Tokens = new CommonTokenStream(Lexer);
            AExclamatedParser Parser = new AExclamatedParser(Tokens);
            var Context = Parser.program();
            AExclamatedVisitor Visitor = new AExclamatedVisitor();

            Visitor.Visit(Context); // Actually Execute it all!

        }
    }
}
