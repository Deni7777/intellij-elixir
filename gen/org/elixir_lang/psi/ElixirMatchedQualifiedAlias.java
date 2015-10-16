// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.psi.PsiReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirMatchedQualifiedAlias extends ElixirMatchedExpression, QualifiedAlias {

  @NotNull
  ElixirAlias getAlias();

  @NotNull
  ElixirDotInfixOperator getDotInfixOperator();

  @NotNull
  ElixirMatchedExpression getMatchedExpression();

  @Nullable
  String fullyQualifiedName();

  @Nullable
  PsiReference getReference();

  @NotNull
  OtpErlangObject quote();

}
