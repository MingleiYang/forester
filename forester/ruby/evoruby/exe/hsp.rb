#!/usr/local/bin/ruby -w
#
# = exe/hsp
#
# Copyright::    Copyright (C) 2017 Christian M. Zmasek
# License::      GNU Lesser General Public License (LGPL)

require 'lib/evo/tool/hmmscan_summary'

module Evoruby

  hsp = HmmscanSummary.new()

  hsp.run()

end  # module Evoruby