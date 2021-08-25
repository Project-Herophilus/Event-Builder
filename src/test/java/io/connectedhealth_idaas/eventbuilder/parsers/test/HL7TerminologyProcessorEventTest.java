package io.connectedhealth_idaas.eventbuilder.parsers.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.connectedhealth_idaas.eventbuilder.dataobjects.general.Codeset;
import io.connectedhealth_idaas.eventbuilder.parsers.hl7v2x.HL7TerminologyParser;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HL7TerminologyProcessorEventTest {

    @Test
    public void parseMSHSegment() {
        String msgBody = "MSH|^~\\&|UNK|UNK|||202105231927||ADT^A01|22139243|P|2.4\r"
            + "EVN|A01|202105231927|\r"
            + "PID||9999999999^^|2216506^||Duck^Donald^^^MR.^MR.||19720227|M|||123 Foo ST.^^TORONTO^ON^M6G 3E6^CA^H^~123 Foo ST.^^TORONTO^ON^M6G 3E6^CA^M^|1811|(416)111-1111||E^ ENGLISH|S| PATIENT DID NOT INDICATE|211004554^||||||||||||\r"
            + "NK1|0222555|NOTREAL^JAMES^R|FA|STREET^OTHER STREET^CITY^ST^55566|(222)111-3333|(888)999-0000|||||||ORGANIZATION\r"
            + "PV1|0001|I|D.ER^1F^M950^01|ER|P000998|11B^M011^02|070615^BATMAN^GEORGE^L|555888^OKNEL^BOB^K^DR^MD|777889^NOTREAL^SAM^T^DR^MD^PHD|ER|D.WT^1A^M010^01|||ER|AMB|02|070615^VOICE^BILL^L|ER|000001916994|D||||||||||||||||GDD|WA|NORM|02|O|02|E.IN^02D^M090^01|E.IN^01D^M080^01|199904072124|199904101200|||||5555112333|||666097^DNOTREAL^MANNY^P\r"
            + "PV2|||0112^TESTING|55555^PATIENT IS NORMAL|NONE|||19990225|19990226|1|1|TESTING|555888^NOTREAL^BOB^K^DR^MD||||||||||PROD^003^099|02|ER||NONE|19990225|19990223|19990316|NONE\r"
            + "AL1|1|DA|TZ1^Thioridazine HCl^From MELLARIL|SV|rash|20210523\r"
            + "AL1|2|DA|F1234^haloperidol^From HALDOL|U|UNKNOWN|20210523\r"
            + "AL1|3|DA|RA123^risperidone^From RISPERDAL|U|UNKNOWN|20210523\r"
            + "AL1|4|DA|TR234^trifluoperazine^TRIFLUOPERAZINE|U|UNKNOWN|20210523\r"
            + "GT1||0222PL|NOTREAL^BOB^B||STREET^OTHER STREET^CITY^ST^77787|(444)999-3333|(222)777-5555||||MO|111-33-5555||||NOTREAL GILL N|STREET^OTHER STREET^CITY^ST^99999|(111)222-3333\r"
            + "IN1||022254P|4558PD|BLUE CROSS|STREET^OTHER STREET^CITY^ST^00990||(333)333-6666||221K|LENIX|||19980515|19990515|||PATIENT01 TEST D||||||||||||||||||02LL|022LP554\r";
        
        HL7TerminologyParser parser= new HL7TerminologyParser();
        List<Codeset> fhirTerms = parser.hl7ParseTermsForProcessing(msgBody);
        

    }
}