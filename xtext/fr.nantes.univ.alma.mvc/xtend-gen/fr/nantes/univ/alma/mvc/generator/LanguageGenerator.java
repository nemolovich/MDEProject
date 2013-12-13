/**
 * generated by Xtext
 */
package fr.nantes.univ.alma.mvc.generator;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Generates code from your model files on save.
 */
@SuppressWarnings("all")
public class LanguageGenerator implements IGenerator {
  public final static String LANGUAGE_EXTENSION = "mvc";
  
  public final static String GEN_PATH = "git/MDEProject/mvc/fr.nantes.univ.alma.mvc.project/gen";
  
  public final static String FILE_NAME = "model-gen.xmi";
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    System.out.println("Starting XMI generation...");
    final Registry registery = Registry.INSTANCE;
    final Map<String,Object> map = registery.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    final XMIResourceFactoryImpl xmiRes = _xMIResourceFactoryImpl;
    map.put(LanguageGenerator.LANGUAGE_EXTENSION, xmiRes);
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    final ResourceSetImpl resSet = _resourceSetImpl;
    String _plus = (LanguageGenerator.GEN_PATH + File.separator);
    String _plus_1 = (_plus + LanguageGenerator.FILE_NAME);
    final URI uri = URI.createURI(_plus_1);
    final Resource res = resSet.createResource(uri);
    String _plus_2 = ("Resource created at \"" + LanguageGenerator.GEN_PATH);
    String _plus_3 = (_plus_2 + File.separator);
    String _plus_4 = (_plus_3 + LanguageGenerator.FILE_NAME);
    String _plus_5 = (_plus_4 + "\"");
    System.out.println(_plus_5);
    EList<EObject> _contents = res.getContents();
    EList<EObject> _contents_1 = resource.getContents();
    _contents.addAll(_contents_1);
    try {
      res.save(Collections.EMPTY_MAP);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    System.out.println("Generation completed");
  }
}
