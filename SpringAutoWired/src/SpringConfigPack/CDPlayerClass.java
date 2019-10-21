package SpringConfigPack;

import BeanPackage.BeanPackageComponentScanIF;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BeanPackageComponentScanIF.class})
public class CDPlayerClass {
}
