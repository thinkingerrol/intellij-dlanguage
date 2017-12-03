package io.github.intellij.dlanguage.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import io.github.intellij.dlanguage.psi.DLanguageModuleDeclaration;
import io.github.intellij.dlanguage.resolve.processors.parameters.DAttributes;

public class DlangModuleDeclarationStub extends DNamedStubBase<DLanguageModuleDeclaration> {

    public DlangModuleDeclarationStub(final StubElement parent, final IStubElementType elementType,
        final StringRef name,
        DAttributes attributes) {
        super(parent, elementType, name, attributes);
    }

    public DlangModuleDeclarationStub(final StubElement parent, final IStubElementType elementType,
        final String name,
        DAttributes attributes) {
        super(parent, elementType, name, attributes);
    }
}
