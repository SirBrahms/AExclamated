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

        public override object VisitConstant(AExclamatedParser.ConstantContext context)
        {
            if (context == null)
                throw new Exception("Value Error");


            if (context.INTEGER != null)
                return int.Parse(context.INTEGER().GetText());

            throw new Exception();
        }
    }
}
