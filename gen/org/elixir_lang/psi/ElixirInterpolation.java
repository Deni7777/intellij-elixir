// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.ericsson.otp.erlang.OtpErlangObject;

public interface ElixirInterpolation extends Quotable {

  @NotNull
  List<ElixirEmptyParentheses> getEmptyParenthesesList();

  @NotNull
  List<ElixirEndOfExpression> getEndOfExpressionList();

  @NotNull
  List<ElixirUnmatchedExpression> getUnmatchedExpressionList();

  @NotNull
  List<ElixirUnqualifiedNoParenthesesManyArgumentsCall> getUnqualifiedNoParenthesesManyArgumentsCallList();

  @NotNull
  OtpErlangObject quote();

}
