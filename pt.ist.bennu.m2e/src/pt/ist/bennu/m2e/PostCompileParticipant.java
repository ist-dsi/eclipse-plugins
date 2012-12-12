package pt.ist.bennu.m2e;

import java.io.File;
import java.util.Set;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.project.configurator.MojoExecutionBuildParticipant;



public class PostCompileParticipant
    extends MojoExecutionBuildParticipant
{

    public PostCompileParticipant( MojoExecution execution )
    {
        super( execution, true );
    }

    @Override
    public Set<IProject> build( int kind, IProgressMonitor monitor )
        throws Exception
    {
	//        IMaven maven = MavenPlugin.getMaven();
	//        BuildContext buildContext = getBuildContext();
	//
	//        // check if any of the grammar files changed
	//        File source = maven.getMojoParameterValue(getSession(), getMojoExecution(), "sourceDirectory", File.class);
	//        Scanner ds = buildContext.newScanner( source ); // delta or full scanner
	//        ds.scan();
	//        String[] includedFiles = ds.getIncludedFiles();
	//        if (includedFiles == null || includedFiles.length <= 0 )
	//        {
	new File("/tmp/didItBennuPCP" + System.currentTimeMillis()).createNewFile();
            return null;
	//        }

        // execute mojo
	//        Set<IProject> result = super.build( kind, monitor );

        // tell m2e builder to refresh generated files
	//        File generated = maven.getMojoParameterValue(getSession(), getMojoExecution(), "outputDirectory", File.class);
	//        if (generated != null) {
	//            buildContext.refresh( generated );
	//        }
	//
	//        return result;
    }
}
