package net.masterthought.dlanguage.psi.impl;

import com.intellij.lang.ASTNode;
import net.masterthought.dlanguage.psi.interfaces.DImportContent;

public class DImportContentImpl extends DCompositeElementImpl implements DImportContent{

    public DImportContentImpl(ASTNode node) {
        super(node);
    }


}
