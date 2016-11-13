/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package suite;

import com.usingjunit.AppTest;
import com.usingjunit.UsingParameters;
import com.usingjunit.UsingParametersTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author Roberto Rodriguez   :: <roberto.rodriguez@smartbt.com>
 */
@RunWith(value=Suite.class)
@SuiteClasses(value = {AppTest.class,UsingParametersTest.class })
public class SuiteA {

}
