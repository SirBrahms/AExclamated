using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AExclamated
{
    class AExclamatedVisitor : AExclamatedBaseVisitor<object?>
    {
        // string -> Name of the Variable
        // object? -> Value of the Variable
        public Dictionary<string, object?> GlobalVariables = new Dictionary<string, object?>(); 

        public override object? VisitAssignment(AExclamatedParser.AssignmentContext context)
        {
            string Name = context.IDENTIFIER().GetText();
            object? Value = Visit(context.expression());

            GlobalVariables.Add(Name, Value);

            return null;
        }

        public override object? VisitConstant(AExclamatedParser.ConstantContext context)
        {
            if (context == null)
                throw new Exception("Value Error");

            // Console.WriteLine(context.BOOL().GetText());

            if (context.INTEGER() is { } i)
                return int.Parse(i.GetText());

            if (context.FLOAT() is { } f)
                return float.Parse(f.GetText());

            if (context.STRING() is { } s)
                return s.GetText()[1..^1]; // I shamelessly stole this >:)

            if (context.BOOL() is { } b) // This doesn't work for some odd reason
               return b.GetText() == "TRUE";

            if (context.NULL() is { })
                return null;



            throw new Exception("");
        }

        public override object? VisitParenthesizedExpression(AExclamatedParser.ParenthesizedExpressionContext context)
        {
            return Visit(context.expression());
        }
    }
}
