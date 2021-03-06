

package io.github.intellij.dlanguage.psi.impl;

import static io.github.intellij.dlanguage.psi.DlangTypes.OP_OR;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import io.github.intellij.dlanguage.psi.DLanguageOrExpression;
import io.github.intellij.dlanguage.psi.DLanguageXorExpression;
import io.github.intellij.dlanguage.psi.DlangVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class DLanguageOrExpressionImpl extends ASTWrapperPsiElement implements
    DLanguageOrExpression {

    public DLanguageOrExpressionImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DlangVisitor visitor) {
        visitor.visitOrExpression(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DlangVisitor) {
            accept((DlangVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Nullable
    public DLanguageOrExpression getOrExpression() {
        return PsiTreeUtil.getChildOfType(this, DLanguageOrExpression.class);
    }

    @Nullable
    public DLanguageXorExpression getXorExpression() {
        return PsiTreeUtil.getChildOfType(this, DLanguageXorExpression.class);
    }

    @Nullable
    public PsiElement getOP_OR() {
        return findChildByType(OP_OR);
    }

}
