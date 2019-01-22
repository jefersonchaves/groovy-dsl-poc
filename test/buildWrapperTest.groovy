import com.lesfurets.jenkins.unit.BasePipelineTest

class buildWrapperTest extends BasePipelineTest {
        
        @Test
        void should_execute_without_errors() throws Exception {
            def script = loadScript("vars/buildWrapper.groovy")
            script.execute()
            printCallStack()
        }
}
