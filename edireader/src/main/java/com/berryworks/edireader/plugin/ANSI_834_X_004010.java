/*
 *  Generated from 834-4010.SEF
 *  using tools provided by BerryWorks Software, LLC
 */
package com.berryworks.edireader.plugin;

public class ANSI_834_X_004010 extends CompositeAwarePlugin {

    public ANSI_834_X_004010() {
        super("834", "Benefit Enrollment and Maintenance");

        // Loop descriptors generated by EDIReader plugin generator
        loops = new LoopDescriptor[]{
                new LoopDescriptor("1100", "ACT", 2, "/1000/1100"),
                new LoopDescriptor("1100", "ACT", 2, "/1000"),
                new LoopDescriptor(CURRENT, "AMT", 3, "/2000/2100/2300"),
                new LoopDescriptor(CURRENT, "AMT", 2, "/2000/2100"),
                new LoopDescriptor(CURRENT, "BGN", 0, ANY_CONTEXT),
                new LoopDescriptor("2320", "COB", 4, "/2000/2100/2300/2320"),
                new LoopDescriptor("2320", "COB", 4, "/2000/2100/2300"),
                new LoopDescriptor(CURRENT, "DMG", 2, "/2000/2100"),
                new LoopDescriptor("2200", "DSB", 3, "/2000/2100/2200"),
                new LoopDescriptor("2200", "DSB", 3, "/2000/2100"),
                new LoopDescriptor(CURRENT, "DTP", 4, "/2000/2100/2300/2320"),
                new LoopDescriptor(CURRENT, "DTP", 3, "/2000/2100/2200"),
                new LoopDescriptor(CURRENT, "DTP", 3, "/2000/2100/2300"),
                new LoopDescriptor(CURRENT, "DTP", 1, "/2000"),
                new LoopDescriptor(CURRENT, "DTP", 0, ANY_CONTEXT),
                new LoopDescriptor("2300", "HD", 3, "/2000/2100/2300"),
                new LoopDescriptor("2300", "HD", 3, "/2000/2100"),
                new LoopDescriptor(CURRENT, "HLH", 2, "/2000/2100"),
                new LoopDescriptor(CURRENT, "ICM", 2, "/2000/2100"),
                new LoopDescriptor(CURRENT, "IDC", 3, "/2000/2100/2300"),
                new LoopDescriptor("2000", "INS", 1, ANY_CONTEXT),
                new LoopDescriptor(CURRENT, "LUI", 2, "/2000/2100"),
                new LoopDescriptor("2310", "LX", 4, "/2000/2100/2300/2310"),
                new LoopDescriptor("2310", "LX", 4, "/2000/2100/2300"),
                new LoopDescriptor(CURRENT, "N1", 4, "/2000/2100/2300/2320"),
                new LoopDescriptor("1000", "N1", 1, ANY_CONTEXT),
                new LoopDescriptor(CURRENT, "N3", 2, "/2000/2100"),
                new LoopDescriptor(CURRENT, "N4", 2, "/2000/2100"),
                new LoopDescriptor(CURRENT, "NM1", 4, "/2000/2100/2300/2310"),
                new LoopDescriptor("2100", "NM1", 2, "/2000/2100"),
                new LoopDescriptor("2100", "NM1", 2, "/2000"),
                new LoopDescriptor(CURRENT, "PER", 4, "/2000/2100/2300/2310"),
                new LoopDescriptor(CURRENT, "PER", 2, "/2000/2100"),
                new LoopDescriptor(CURRENT, "PLA", 4, "/2000/2100/2300/2310"),
                new LoopDescriptor(CURRENT, "REF", 4, "/2000/2100/2300/2320"),
                new LoopDescriptor(CURRENT, "REF", 3, "/2000/2100/2300"),
                new LoopDescriptor(CURRENT, "REF", 1, "/2000"),
                new LoopDescriptor(CURRENT, "REF", 0, ANY_CONTEXT),
                new LoopDescriptor(CURRENT, "ST", 0, ANY_CONTEXT),
        };

        composites.put("REF-4", "");

    }
}  
