
"基础设置
set nocompatible                " don't bother with vi compatibility "
set autoread                    " reload files when changed on disk, i.e. via `git checkout` "
set shortmess=atI   
                    
set magic                       " For regular expressions turn magic on "
set title                       " change the terminal's title "
set nobackup                    " do not keep a backup file "                                                                                           
                    
set noerrorbells                " don't beep "
set visualbell t_vb=            " turn off error beep/flash "
set t_vb=           
set timeoutlen=500
set mouse=a
set textwidth=80
set wrap
"编码设置
set encoding=utf-8
set fileencodings=ucs-bom,utf-8,cp936,gb18030,big5,euc-jp,euc-kr,latin1
set fileformats=unix,dos,mac
set termencoding=utf-8
set formatoptions+=m
set formatoptions+=B

"界面显示设置
set ruler                       " show the current row and column "
set number                      " show line numbers "
set nowrap          
set showcmd                     " display incomplete commands "                                                                                          
set showmode                    " display current modes "
set showmatch                   " jump to matches when entering parentheses "
set matchtime=2                 " tenths of a second to show the matching parenthesis "

"搜索设置
set hlsearch                    " highlight searches "
set incsearch                   " do incremental searching, search as you type "
set ignorecase                  " ignore case when searching "
set smartcase                   " no ignorecase if Uppercase char present "

"制表符设置
set expandtab                   " expand tabs to spaces "
set smarttab        
set shiftround

"缩进设置
set autoindent smartindent shiftround
set shiftwidth=4
set tabstop=4
set softtabstop=4                " insert mode tab and backspace use 4 spaces "

"光标设置
set cursorcolumn
set cursorline


"文件类型设置
filetype on
filetype plugin on
filetype indent on
autocmd FileType python set tabstop=4 shiftwidth=4 expandtab ai


let g:powerline_pycmd="py3"
let g:airline_powerline_fonts = 1
let g:airline#extensions#tabline#enabled = 1
set guifont=Menlo\ for\ Powerline


let g:completor_node_binary = '/path/to/node'
let g:completor_python_binary = '/path/to/python/with/jedi/installed'
let g:powerline_pycmd="py3"
let g:airline_powerline_fonts = 1
let g:airline#extensions#tabline#enabled = 1


let g:ale_sign_column_always = 1
let g:ale_sign_error = '>>'
let g:ale_sign_warning = '--'
let g:airline#extensions#ale#enabled = 1
let g:ale_set_loclist = 0
let g:ale_set_quickfix = 1
set guifont=Menlo\ for\ Powerline

call plug#begin('~/.vim/plugged')
Plug 'mhinz/vim-startify'
Plug 'junegunn/vim-easy-align'
Plug 'scrooloose/nerdtree'
Plug 'junegunn/fzf', { 'dir': '~/.fzf', 'do': './install --all' }
Plug 'rdnetto/YCM-Generator'
Plug 'vim-airline/vim-airline'
Plug 'vim-airline/vim-airline-themes'
Plug 'kien/rainbow_parentheses.vim'
Plug 'jiangmiao/auto-pairs'
"导航栏
Plug 'majutsushi/tagbar'
"自动补全
Plug 'maralla/completor.vim'
"代码检测
Plug 'w0rp/ale'
call plug#end()


"nerdtree快捷键
map <C-n> :NERDTreeToggle<CR>
map <C-t> :TagbarToggle<CR>
map <silent> <C-k> <Plug>(ale_previous_wrap)
map <silent> <C-J> <Plug>(ale_next_wrap)
