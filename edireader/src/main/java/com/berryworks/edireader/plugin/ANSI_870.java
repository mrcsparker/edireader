/*
 * Copyright 2005-2011 by BerryWorks Software, LLC. All rights reserved.
 *
 * This file is part of EDIReader. You may obtain a license for its use directly from
 * BerryWorks Software, and you may also choose to use this software under the terms of the
 * GPL version 3. Other products in the EDIReader software suite are available only by licensing
 * with BerryWorks. Only those files bearing the GPL statement below are available under the GPL.
 *
 * EDIReader is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * EDIReader is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with EDIReader.  If not,
 * see <http://www.gnu.org/licenses/>.
 */

/*
*  Generated by plugin generator utility by BerryWorks Software, LLC.
*/
package com.berryworks.edireader.plugin;

import com.berryworks.edireader.Plugin;

public class ANSI_870 extends Plugin
{
  public ANSI_870()
  {
    super("870", "Order Status Report");
    loops = new LoopDescriptor[]{
      new LoopDescriptor(".", "BSR", 0, "*"),
      new LoopDescriptor(null, "CS", 1, "/HL"),
      new LoopDescriptor(".", "CTT", 0, "*"),
      new LoopDescriptor(null, "DTM", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "DTM", 1, "/HL"),
      new LoopDescriptor(".", "DTM", 0, "*"),
      new LoopDescriptor("HL", "HL", 1, "*"),
      new LoopDescriptor("ISR", "ISR", 3, "/HL/PO1"),
      new LoopDescriptor("ISR", "ISR", 2, "/HL"),
      new LoopDescriptor(null, "ITA", 3, "/HL/PO1/ISR"),
      new LoopDescriptor("LM", "LM", 4, "/HL/PO1/ISR"),
      new LoopDescriptor("LM", "LM", 2, "/HL"),
      new LoopDescriptor("LM", "LM", 1, "*"),
      new LoopDescriptor(null, "LQ", 4, "/HL/PO1/ISR/LM"),
      new LoopDescriptor(null, "LQ", 2, "/HL/LM"),
      new LoopDescriptor(null, "LQ", 1, "/LM"),
      new LoopDescriptor("LX", "LX", 3, "/HL/PO1"),
      new LoopDescriptor(null, "MEA", 2, "/HL/PO1"),
      new LoopDescriptor(null, "N1", 3, "/HL/PO1/ISR"),
      new LoopDescriptor("N1", "N1", 2, "/HL"),
      new LoopDescriptor("N1", "N1", 1, "*"),
      new LoopDescriptor(null, "N2", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "N2", 2, "/HL/N1"),
      new LoopDescriptor(null, "N2", 1, "/N1"),
      new LoopDescriptor(null, "N3", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "N3", 2, "/HL/N1"),
      new LoopDescriptor(null, "N3", 1, "/N1"),
      new LoopDescriptor(null, "N4", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "N4", 2, "/HL/N1"),
      new LoopDescriptor(null, "N4", 1, "/N1"),
      new LoopDescriptor(".", "NTE", 0, "*"),
      new LoopDescriptor(null, "PER", 2, "/HL/N1"),
      new LoopDescriptor(null, "PER", 1, "/N1"),
      new LoopDescriptor(null, "PID", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "PID", 2, "/HL/ISR"),
      new LoopDescriptor(null, "PKG", 2, "/HL/PO1"),
      new LoopDescriptor("PO1", "PO1", 2, "/HL"),
      new LoopDescriptor(null, "PO3", 2, "/HL/PO1"),
      new LoopDescriptor(null, "PRF", 1, "/HL"),
      new LoopDescriptor(null, "PWK", 1, "/N1"),
      new LoopDescriptor(null, "QTY", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "QTY", 2, "/HL/ISR"),
      new LoopDescriptor(null, "REF", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "REF", 2, "/HL/N1"),
      new LoopDescriptor(null, "REF", 1, "/N1"),
      new LoopDescriptor(".", "REF", 0, "*"),
      new LoopDescriptor(".", "SE", 0, "*"),
      new LoopDescriptor(null, "SLN", 2, "/HL/PO1"),
      new LoopDescriptor(".", "ST", 0, "*"),
      new LoopDescriptor(null, "TD1", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "TD3", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "TD4", 3, "/HL/PO1/ISR"),
      new LoopDescriptor(null, "TD5", 3, "/HL/PO1/ISR"),
    };
  }
}
